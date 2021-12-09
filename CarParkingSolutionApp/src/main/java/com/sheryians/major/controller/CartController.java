package com.sheryians.major.controller;

//import com.paypal.api.payments.Links;
//import com.paypal.api.payments.Payment;
//import com.paypal.base.rest.PayPalRESTException;
import com.sheryians.major.global.GlobalData;
import com.sheryians.major.model.ParkingSpace;
import com.sheryians.major.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CartController {
    @Autowired
    ParkingSpaceService parkingSpaceService;


    @GetMapping("/addToCart/{id}")
    public String addToCart(@PathVariable int id) {
        GlobalData.cart.add(parkingSpaceService.getPSById(id).get()); //error: passed id into get()
        return "redirect:/shop";
    }

    @GetMapping("/cart")
    public String cartGet(Model model) {
        model.addAttribute("cartCount", GlobalData.cart.size());
        model.addAttribute("total", GlobalData.cart.stream().mapToInt(ParkingSpace::getPrice).sum());
        model.addAttribute("cart", GlobalData.cart);
        return "cart";
    }
    @GetMapping("/cart/removeItem/{index}")
    public String cartItemRemove(@PathVariable int index){
        GlobalData.cart.remove(index);
        return "redirect:/cart";
    }
    @GetMapping("/checkout")
    public String checkout(Model model){
        model.addAttribute("total", GlobalData.cart.stream().mapToInt(ParkingSpace::getPrice).sum());
        for(int i = 0; i < GlobalData.cart.size(); i++){
            ParkingSpace PS = parkingSpaceService.getSinglePSById(GlobalData.cart.get(i).getId());
            PS.setAvailable(false);
            parkingSpaceService.addPS(PS);
        }
        GlobalData.cart.clear();
        return "checkout";
    }



}

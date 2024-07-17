package laptopshop.controller.client;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import laptopshop.domain.Product;
import laptopshop.domain.User;
import laptopshop.service.ProductService;

@Controller
public class ItemController {

    private final ProductService productService;

    public ItemController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product/{id}")
    public String getUserDetailPage(Model model, @PathVariable long id) {
        Product products = this.productService.fetchProductById(id);
        model.addAttribute("product", products);
        model.addAttribute("id", id);
        return "client/product/detail";
    }
}

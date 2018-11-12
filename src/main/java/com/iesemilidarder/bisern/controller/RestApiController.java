    package com.iesemilidarder.bisern.controller;

    import com.iesemilidarder.bisern.DataHelper;
    import com.iesemilidarder.bisern.data.Activity;
    import com.iesemilidarder.bisern.data.ActivityType;
    import com.iesemilidarder.bisern.data.Product;
    import org.apache.commons.lang3.StringUtils;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.ArrayList;
    import java.util.List;

    @RestController
    @RequestMapping("/rest")
    public class RestApiController {
        /*@RequestMapping("/hi")
        public String sayHi() {
            return "hi";
        }*/

        @RequestMapping("/getAll")
        public List<Product> getAll() {
            return DataHelper.getProducts();
        }


        @RequestMapping("/addActivity")
        public List<Product> addActivity(
                @RequestParam(value = "name", defaultValue = StringUtils.EMPTY) String name
        ) {
            //StringUtils.equals(ActivityType.MUSEUM.toString(),"MUSEUM")
            Activity aux = new Activity();
            aux.setName(name);
            DataHelper.add(aux);
            return DataHelper.getProducts();
        }

        @RequestMapping("/getEnum")
        public ActivityType addActivity(
                @RequestParam(value = "name", defaultValue = StringUtils.EMPTY) ActivityType name
        ){
            List<Product> aux = new ArrayList<>();
            for (Product p: DataHelper.getProducts()
                 ) {

            }
            return name;
        }
        @RequestMapping("/getPrice")
        public Product addProduct(
                @RequestParam(value = "price", defaultValue = StringUtils.EMPTY) Product price
        ){
            List<Product> aux = new ArrayList<>();
            for (Product p: DataHelper.getProducts()
            ) {

            }
            return price;
        }
    }

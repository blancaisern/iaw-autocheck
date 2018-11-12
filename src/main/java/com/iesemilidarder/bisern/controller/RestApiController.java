    package com.iesemilidarder.bisern.controller;

    import com.iesemilidarder.bisern.DataHelper;
    import com.iesemilidarder.bisern.data.Activity;
    import com.iesemilidarder.bisern.data.ActivityType;
    import com.iesemilidarder.bisern.data.Product;
    import org.apache.commons.lang3.StringUtils;
    import org.springframework.web.bind.annotation.*;

    import java.util.ArrayList;
    import java.util.List;

    @RestController
    @RequestMapping("/rest")
    public class RestApiController {

        /* getAll */
        @RequestMapping("/getAll")
        public List<Product> getAll() {
            return DataHelper.getProducts();
        }

        /* Ver por id getProduct*/
        @RequestMapping("/activity/{id}")
        public Product getProduct(@PathVariable String id){
            return DataHelper.getProduct(id);
        }

        /* addProduct */
        @RequestMapping("/addActivity")
        public List<Product> addActivity(
                @RequestParam(value = "id", defaultValue = StringUtils.EMPTY)String id,
                    @RequestParam(value="name", defaultValue = StringUtils.EMPTY) String name,
                        @RequestParam(value="price", defaultValue = StringUtils.EMPTY) Double price)
        {
            //StringUtils.equals(ActivityType.MUSEUM.toString(),"MUSEUM")
            Activity aux = new Activity();
            aux.setId(id);
            aux.setName(name);
            aux.setPrice(price);
            DataHelper.add(aux);
            return DataHelper.getProducts();
        }

        /*  */
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
    }

package cn.edu.hit.ices.restdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Random;

@RestController
public class IndexController {
    @Autowired
    HttpServletRequest request;

    Random random = new Random();

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/",produces="application/json;charset=UTF-8")
    public int random(@RequestParam(name = "range_from",defaultValue="0")  int from, @RequestParam(name = "range_to",defaultValue = "100") int to) throws IOException {
        return random.nextInt(to-from)+from;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }
}

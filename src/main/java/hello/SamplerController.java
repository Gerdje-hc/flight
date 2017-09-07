package hello;   // SPRING SERVER CONNECTIE AANGEMAAKT
// handmatig opzetten van een fileReader die de HTML file weergeeft in je server localHost


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

@Controller
@EnableAutoConfiguration
class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        try {
            BufferedReader r = new BufferedReader(new FileReader("index.html"));
            String all = "";
            String l = r.readLine();
            while(l != null) {
                all += l;
                l = r.readLine();

            }
            return all;

        } catch (IOException e) {
            e.printStackTrace();
            return "Fout" + e.getMessage();
        }


    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
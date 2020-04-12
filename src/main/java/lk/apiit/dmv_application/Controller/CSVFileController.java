package lk.apiit.dmv_application.Controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;

@Controller
@RequestMapping("/csv")
public class CSVFileController {

    @RequestMapping(value = "/file", method = RequestMethod.GET)
    public ResponseEntity<?> sendCSVFile() throws Exception {

        File csvSource = ResourceUtils.getFile("classpath:templates/DMVOffenses.csv");

        byte[] csvFileData = FileUtils.readFileToByteArray(csvSource);
        return ResponseEntity.ok(csvFileData);
    }

}

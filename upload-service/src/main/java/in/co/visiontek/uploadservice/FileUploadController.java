package in.co.visiontek.uploadservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/files")
public class FileUploadController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {

        String filePath = "/opt/kafkauploads/" + file.getOriginalFilename();

        File dest = new File(filePath);
        dest.getParentFile().mkdirs();

        file.transferTo(dest);

        String event = "{ \"fileId\":\"1\", \"filePath\":\"" + filePath + "\", \"status\":\"UPLOADED\" }";

        producerService.sendMessage(event);

        return "File uploaded + event sent to Kafka";
    }
}

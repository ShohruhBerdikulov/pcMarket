package uz.pdp.pcmarket.controller;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.entitiy.Attachment;
import uz.pdp.pcmarket.repository.AttachmentRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attachment")
public class AttachmentController {
    @Autowired
    AttachmentRepository repository;

    @PostMapping("/upload")
    public String upload(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        if (file != null) {
            String originalFilename = file.getOriginalFilename();
            Attachment attachment = new Attachment();
            attachment.setName(originalFilename);
            String[] split = originalFilename.split("\\.");
            String type = split[split.length - 1];
            attachment.setContentType(type);   //salom.txt==> .txt
            attachment.setSize(file.getBytes());
            attachment.setName(file.getName());
            repository.save(attachment);
            return "success";
        }
        return "Fail!";
    }

    @GetMapping("/info")
    public List<Attachment> getAll() {
        return repository.findAll();
    }

    @GetMapping("/info/{id}")
    public Attachment getOne(@PathVariable Integer id) {
        Optional<Attachment> byId = repository.findById(id);
        return byId.orElseGet(Attachment::new);
    }

    @SneakyThrows
    @GetMapping("/download/{id}")
    public void getFile(@PathVariable Integer id, HttpServletResponse response) {
        Optional<Attachment> byId = repository.findById(id);
        if (byId.isPresent()) {
            Attachment attachment = byId.get();
            response.setHeader("Content-Disposition", "" +
                    "attachment;filename=\"" + attachment.getName() + "." + attachment.getContentType() + "\"");
            response.setContentType(attachment.getContentType());
            FileCopyUtils.copy(attachment.getSize(), response.getOutputStream());
        }
    }
}

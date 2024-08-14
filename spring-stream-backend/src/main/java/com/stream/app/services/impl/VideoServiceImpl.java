package com.stream.app.services.impl;

import com.stream.app.entities.Video;
import com.stream.app.services.VideoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Value("${files.video}")
    String DIR;

    @Override
    public Video save(Video video, MultipartFile file) {

        try {


            //Original files name : image.png-> image


            String filename = file.getOriginalFilename();
            String contentType = file.getContentType();
            InputStream inputStream = file.getInputStream();




            // create folder path
            String cleanFileName=StringUtils.cleanPath(filename);
            String cleanFolder=StringUtils.cleanPath(DIR);

            Path path=Paths.get(cleanFolder,cleanFileName);

            System.out.println(contentType);
            System.out.println(path);


            // folder pathname with filename

            //copy file to the folder

            //make video metadata

            // save metadata

        }catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return null;
    }
}
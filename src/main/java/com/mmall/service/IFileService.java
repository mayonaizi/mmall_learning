package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by hongyan on 2019/11/18.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}

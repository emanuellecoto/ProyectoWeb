package com.practica01.Practica01.service;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Service;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "arboles-29b1a.appspot.com";

    final String rutaSuperiorStorage = "arboles";
    
    final String rutaJsonFile = "firebase";

    final String archivoJsonFile = "arboles-29b1a-firebase-adminsdk-2td3r-66b67ecc4c.json";
}

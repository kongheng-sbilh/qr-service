package com.kh.qrs.service;

import com.google.zxing.WriterException;

import java.io.IOException;

public interface QRService {

    byte[] generate(String text, int width, int height) throws WriterException, IOException;

}

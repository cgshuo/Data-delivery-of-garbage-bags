/**
 * 
 */
package com.cgs.weixin.qrcode;

import java.io.File;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Hashtable;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRcode {
	@SuppressWarnings("deprecation")
	public static void qrcode(String text) throws WriterException, IOException, KeyManagementException,
			NoSuchAlgorithmException, NoSuchProviderException {
		int width = 300;
		int height = 300;
		String format = "png";
		Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);
		File outputFile = new File("WebContent","qs.png");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	}

}
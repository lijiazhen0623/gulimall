package com.zhen.gulimall.thirdparty;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class GulimallThirdPartyApplicationTests {
	@Autowired
	private OSSClient ossClient;

	@Test
	public void saveFile() throws IOException {
		ossClient.putObject("ljz-gulimall", "a.jpg", Files.newInputStream(new File("C:\\Users\\ASUS\\Pictures\\Saved Pictures\\a.jpg").toPath()));
	}
	@Test
	public void test(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(new Date()));
	}

}

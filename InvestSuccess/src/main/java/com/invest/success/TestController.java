package com.invest.success;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@PostMapping("/ip")
	public ResponseEntity<String> ip (HttpServletRequest request){
		// ��û ���� Ŭ���̾�Ʈ�� Ip�ּ� ��ȯ
		return ResponseEntity.ok(request.getRemoteAddr());
	}
}

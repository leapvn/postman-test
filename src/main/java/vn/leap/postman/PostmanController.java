package vn.leap.postman;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/postman")
public class PostmanController {

	@GetMapping("/payment-method")
	public ResponseEntity<List<PaymentMethod>> get() {

		var paymentMethod = new PaymentMethod();
		paymentMethod.setId(1L);
		paymentMethod.setName("name 1");
		paymentMethod.setPaymentCode("code 1");
		paymentMethod.setPercentFee(new BigDecimal(10));
		paymentMethod.setFixedFee(new BigDecimal(10));
		paymentMethod.setSmsFee(new BigDecimal(10));
		paymentMethod.setEnabled(true);
		paymentMethod.setBankOrCcCode("bank 1");

		return ResponseEntity.ok().body(List.of(paymentMethod, paymentMethod));
	}
}

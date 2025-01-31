package lk.ijse.payment_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentDto {
    private String paymentId;
    private String ticketId;
    private String userId;
    private double amount;
    private Date paymentDate;
}

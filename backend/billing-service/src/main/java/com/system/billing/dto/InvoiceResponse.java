import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceResponse {
    private Long id;
    private Long appointmentId;
    private Long patientId;
    private Long doctorId;
    private String invoiceNumber;
    private Double amount;
    private Double taxAmount;
    private Double totalAmount;
    private String status;
    private String paymentMethod;
    private Date paymentDate;
    private Date issueDate;
    private Date dueDate;
    private String notes;
    private Date createdAt;
    private Date updatedAt;
}
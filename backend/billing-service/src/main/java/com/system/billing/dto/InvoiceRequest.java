import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRequest {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private double amount;
    private double taxAmount;
    private double totalAmount;
    private String paymentMethod;
    private String dueDate;
    private String notes;
}
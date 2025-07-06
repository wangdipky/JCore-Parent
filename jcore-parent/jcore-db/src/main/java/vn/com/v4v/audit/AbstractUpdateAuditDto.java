package vn.com.v4v.audit;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Name: AbstractUpdateAuditDto
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 06/07/2025
 */
@NoArgsConstructor
@Setter
@Getter
public class AbstractUpdateAuditDto extends AbstractCreateAuditDto{

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Column(name = "UPDATED_BY")
    private Date updatedDate;
}

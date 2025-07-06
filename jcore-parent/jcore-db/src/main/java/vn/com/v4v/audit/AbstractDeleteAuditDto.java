package vn.com.v4v.audit;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Name: AbstractDeleteAuditDto
 * Author: QuangDK
 * Version: 1.0.0
 * CreatedDate: 06/07/2025
 */
@NoArgsConstructor
@Setter
@Getter
public class AbstractDeleteAuditDto extends AbstractUpdateAuditDto{

    @Column(name = "DELETED_BY")
    private Long deletedBy;

    @Column(name = "DELETED_DATE")
    private Date deletedDate;
}
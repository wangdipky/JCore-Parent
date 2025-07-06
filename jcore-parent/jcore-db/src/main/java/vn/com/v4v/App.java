package vn.com.v4v;

import vn.com.v4v.audit.AbstractCreateAuditDto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractCreateAuditDto dto = new AbstractCreateAuditDto();
        dto.setId("1");
        System.out.printf(dto.getId());
    }
}

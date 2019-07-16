package com.wcs.app.sb.main.utility;

import java.util.List;

import com.wcs.app.sb.main.dto.InvoiceDTO;
import com.wcs.app.sb.main.model.Invoice;

public class InvoiceNoAutoGenerator {
	public static String invoiceNumberGenerator(List<InvoiceDTO> li)
	{
		String prefixInvoice = "Inv";
		int max=0;
		for(InvoiceDTO i : li)
		{
			System.out.println(i.getInvoiceNo());
			String myNumberString = i.getInvoiceNo().substring(3);
			int myNumber = Integer.parseInt(myNumberString);
			System.out.println(myNumber);
			if(myNumber > max)
			{
				max = myNumber;
			}
					
		}
		max++;
		System.out.println(max);
		return prefixInvoice.concat(Integer.toString(max));
		
	}

}

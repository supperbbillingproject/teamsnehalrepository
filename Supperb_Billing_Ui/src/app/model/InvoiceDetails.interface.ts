import { ProductDTO } from './ProductDTO.interface';
import { CustomerInformation } from './customerinformation.interface';

export class InvoiceDetails {
    info: ProductDTO[];
    customerinfo: CustomerInformation;
    totalamount: number;
    totaldiscountamount: number;
    payableamount: number;
    invoicegeneratedby: string;
    totaltaxamount: number;
    servicecharges: number;
    deliverycharges: number;
}

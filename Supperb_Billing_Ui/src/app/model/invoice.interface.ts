import { BranchInformation } from "./branchinformation.interface";
import { RelationshipExecutiveInformation } from "./relationshipexecutiveinformation.interface";
import { CustomerInformation } from "./customerinformation.interface";
import { InvoiceQuantity } from "./invoiceQuantity.interface";
import { InvoiceProductUnitPrice } from "./InvoiceProductUnitPrice.interface";
export class Invoice {

    customer: CustomerInformation;
    invoiceNo: number;
    date: string;
    map: Map<string, InvoiceQuantity>[];
    pmap: Map<string, InvoiceProductUnitPrice>[];
    discount: number;
    totalamount: number;
    totaldiscountamount: number;
    payableamount: number;
    invoicegeneratedby: string;
    totaltaxamount: number;
    servicecharges: number;
    deliverycharges: number;
}

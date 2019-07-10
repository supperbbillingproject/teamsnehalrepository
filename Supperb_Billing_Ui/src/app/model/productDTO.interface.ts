import { ProductInformation } from './ProductInformation.interface';
import { VenderInformation } from './vendorInformation.interface';
import { Tax } from './tax.interface';

export class productDTO {
    productid: number;
    productcode: string;
    productname: string;
    hsncode: string;
    buyingPrice: number;
    sellingPrice: number;
    tax: Tax;
    productInformation: ProductInformation;
    venderInformation: VenderInformation;
}
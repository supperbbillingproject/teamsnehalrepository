import { ProductInformation } from './ProductInformation.interface';
import { VenderInformation } from './vendorInformation.interface';
import { Tax } from './tax.interface';

export class ProductDTO {
    productid: number;
    quantity: number;
    productname: string;
    hsncode: string;
    producttype: string;
    productcode: string;
    productcategoryname: string;
    sellingprice: number;
    taxgroup: number;
    suppliername: string;
    taxableprice: number;
    totaltaxperqty: number;

}

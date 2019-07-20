import { Tax } from "./tax.interface";
import { ProductInformation } from "./ProductInformation.interface";
import { VenderInformation } from "./vendorInformation.interface";

export interface ProductPriceMapping
{
    pricemappingid:number;
    buyingPrice:number;
    sellingPrice:number;
    tax:Tax;
    productInformation:ProductInformation;
    venderInformation:VenderInformation;
}
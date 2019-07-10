import { ProductInformation } from "./ProductInformation.interface";
import { VenderInformation } from "./venderInformation.interface";

export interface VenderWisePurchaseOrder
{
    venderPurchaseno: number;
    pmap:Map<ProductInformation,VenderInformation>[];
    venderInformation: VenderInformation;

}
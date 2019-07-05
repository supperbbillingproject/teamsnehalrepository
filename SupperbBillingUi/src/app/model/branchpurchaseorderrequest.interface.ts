import { BranchInformation } from "./BranchInformation.interface";
import { ProductPriceMapping } from "./productPriceMapping.interface";
import { BranchPurchaseOrderProductWiseQuantity } from "./branchpurchaseorderproductwisequantity.interface";

export interface BranchPurchaseOrderRequest
{
    purchaseOrderRequestId:number;
    branchInformation:BranchInformation;
    pmap:Map<ProductPriceMapping,BranchPurchaseOrderProductWiseQuantity>[];
    date:string;
}
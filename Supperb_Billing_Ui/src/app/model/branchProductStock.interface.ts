import { BranchInformation } from "./branchInformation.interface";
import { ProductPriceMapping } from "./productPriceMapping.interface";
import { BranchPurchesOrderProductWiseQuantity } from "./branchPurchesOrderProductWiseQuantity.interface";
import { BranchProductStockWiseQuantity } from "./BranchProductStockWiseQuantity.interface";

export interface branchProductStock
{
    purchaseOrderRequestId:number;
    branchInformation:BranchInformation;
    pmap:Map<ProductPriceMapping,BranchProductStockWiseQuantity>;
    date:string;
}
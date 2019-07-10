import { BranchInformation } from "./branchInformation.interface";
import { ProductPriceMapping } from "./productPriceMapping.interface";
import { branchProductTransferQuantity } from "./branchProductTransferQuantity.interface";

export interface branchStockTransfer
{
    branchStockTransferId:string;
    fromBranch:BranchInformation;
    toBranch:BranchInformation;
    transferDate:Date;
    pmap:Map<ProductPriceMapping,branchProductTransferQuantity>
}

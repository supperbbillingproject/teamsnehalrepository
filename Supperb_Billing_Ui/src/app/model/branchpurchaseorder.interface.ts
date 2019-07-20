import { BranchPurchaseOrderRequest } from "./branchPurchaseOrderRequest.interface";
import { VenderWisePurchaseOrder } from "./venderWisePurchaseOrder.interface";

export interface Branchpurchaseorder {
    purchesOrder:number;
    status:string;
    branchPurchaseOrderRequest:BranchPurchaseOrderRequest;
    venderWisePurchaseOrder:VenderWisePurchaseOrder[];
    orderdate:string;
   
}
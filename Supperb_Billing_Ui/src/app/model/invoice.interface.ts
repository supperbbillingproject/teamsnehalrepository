import {BranchInformation} from "./branchinformation.interface";
import {RelationshipExecutiveInformation} from "./relationshipexecutiveinformation.interface";
import { CustomerInformation } from "./customerinformation.interface";
export interface Invoice{

invoiceNo: string;
totalAmount : number;
invoiceGenerationDate : string;
branchinformation:BranchInformation;
executiveInformation:RelationshipExecutiveInformation;
customerInformation: CustomerInformation
}
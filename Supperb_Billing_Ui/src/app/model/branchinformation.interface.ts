import { State } from "./state.interface";
import { District } from "./district.interface";

export interface BranchInformation{

branchCode: string;
branchName : string;
state:State;
district:District;
branchAddress: string;
branchPincode: number;
branchContactNumber: number;
branchEmailId: string;
branchStatus : string;
branchType: string;
openingDate: string;

}
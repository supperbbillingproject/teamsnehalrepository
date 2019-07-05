import { District } from "./district.interface";
import { State } from "./state.interface";
import { country } from "./Country.interface";

export interface supplier
{
    id:number;
    suppliername:string;
    suppliercompanyname:string;
    supplieraddress:string;
    distric:District;
    state:State;
    GSTIN:string;
    country:country;
    date:string;



}
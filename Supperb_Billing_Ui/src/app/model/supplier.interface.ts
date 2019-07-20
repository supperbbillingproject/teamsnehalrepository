import { District } from "./district.interface";
import { State } from "./state.interface";
import { Country } from "./Country.interface";

export interface supplier {

    suppliername: string;
    suppliercompanyname: string;
    supplieraddress: string;
    district: District;
    state: State;
    gstin: string;
    country: Country;
    date: string;
}
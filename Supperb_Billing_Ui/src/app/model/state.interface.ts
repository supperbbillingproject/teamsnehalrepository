import { Country } from "./country.interface";

export interface State {
    stateid: number;
    statename: string;
    country: Country;
}

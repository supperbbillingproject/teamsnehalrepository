import { State } from './state.interface';
import { Country } from './country.interface';
import { City } from './city.interface';

export interface CustomerInformation {
    customerId: number;
    customerName: string;
    customerType: string;
    customerMobileNo: string;
    customerMailId: string;
    customerPanCardNo: string;
    customerDoorNo: string;
    customerStreetname: string;
    customerLaneName: string;
    customerArea: string;
    custmerZipcode: number;
    customerState: State;
    customerCountry: Country;
    customerCity: City;
    customerGSTIN: string;
}
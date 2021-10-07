package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.IKIKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        IKIKPSPublicSoap kpsPublicSoap = new IKIKPSPublicSoap();
        try {
            return kpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
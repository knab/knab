package knab.core;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author knab (knab@telecolumbus.net)
 * @since 14-Aug-2010 23:05:09
 */
public class Client {

    private String name;
    private Collection<Bank> banks = new ArrayList<Bank>();

    public Client(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBank(final Bank bank) {
        banks.add(bank);
    }

    public boolean hasBanks() {
        return !banks.isEmpty();
    }

    @Override
    public boolean equals(final Object right) {
        if (this == right) {
            return true;
        }
        if (right == null || getClass() != right.getClass()) {
            return false;
        }
        Client client = (Client) right;
        return !(name != null ? !name.equals(client.name) : client.name != null);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}

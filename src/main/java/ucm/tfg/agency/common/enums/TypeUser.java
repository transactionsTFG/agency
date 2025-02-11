package ucm.tfg.agency.common.enums;

public enum TypeUser {
    CLIENT(1);
    private final int idType;
    private TypeUser(int idType) {
        this.idType = idType;
    }  
    
    public int getIdType() {
        return idType;
    }
}

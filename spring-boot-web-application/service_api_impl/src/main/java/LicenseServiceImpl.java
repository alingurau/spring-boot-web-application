
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LicenseServiceImpl implements LicenseService{
    @Autowired
    LicenseService licenseService;

    @Override
    public String generate(){
        return "";

    }

    @Override
    public boolean validate() {
        return false;
    }
}

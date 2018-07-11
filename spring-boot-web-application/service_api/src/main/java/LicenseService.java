import org.springframework.stereotype.Service;

@Service
public interface LicenseService {
    String generate ();
    boolean validate();
}

package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nathaniel.stevens on 4/28/17.
 */
@RestController
@RequestMapping(path="/api")
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/users")
    @CrossOrigin(origins="http://localhost:4200")
    public @ResponseBody String addNewUser (@RequestBody User user) {
        userRepository.save(user);
        return "Saved";
    }

    @GetMapping(path="/users")
    @CrossOrigin(origins="http://localhost:4200")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}

package com.example.client;
import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Bean
    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository) {
        return args -> {
            clientRepository.save(new Client(null, "John", "Doe", 30f));
            clientRepository.save(new Client(null, "Jane", "Smith", 25f));
        };
    }
}

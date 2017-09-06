package io.khasang.teamnote.config;

import io.khasang.teamnote.dao.DocumentDao;
import io.khasang.teamnote.dao.ItemsDao;
import io.khasang.teamnote.dao.impl.DocumentDaoImpl;
import io.khasang.teamnote.dao.impl.ItemsDaoImpl;
import io.khasang.teamnote.entity.Document;
import io.khasang.teamnote.entity.Items;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author d.grushetskiy
 */
@Configuration
public class AppConfig {
    @Bean
    public DocumentDao documentDao(){
        return new DocumentDaoImpl(Document.class);
    }

    @Bean
    public ItemsDao itemsDao(){
        return new ItemsDaoImpl(Items.class);
    }
}

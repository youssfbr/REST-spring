package com.github.youssfbr;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.github.youssfbr.entities.Produto;
import com.github.youssfbr.exceptions.ProductPriceException;
import com.github.youssfbr.services.ProdutoService;

@SpringBootTest
class ProdutoTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    void verificaValorNegativoNoProduto() {
        Produto produto = new Produto();

        produto.setNome("Teste");
        produto.setPreco(-10.0);

        assertThrows(ProductPriceException.class, () -> produtoService.save(produto));
    }

}

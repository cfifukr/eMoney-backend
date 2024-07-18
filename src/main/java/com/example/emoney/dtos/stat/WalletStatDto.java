package com.example.emoney.dtos.stat;

import com.example.emoney.dtos.response.WalletResponseDto;
import com.example.emoney.dtos.pageable.TransactionPageDto;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class WalletStatDto {
    private WalletResponseDto walletDto;

    private TransactionPageDto transactionsDto;



    public WalletStatDto(WalletResponseDto walletDto, TransactionPageDto transactionsDto) {
        this.walletDto = walletDto;
        this.transactionsDto = transactionsDto;
    }


}

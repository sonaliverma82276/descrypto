package deshaw.dae.descrypto.mappers;

import deshaw.dae.descrypto.domain.FundsInfo;
import deshaw.dae.descrypto.domain.Wallet;

import java.util.HashMap;
import java.util.List;

public interface WalletMapper {
    List<Wallet> findAssetsForUser(int userId);
    void addFund(int userId, String assetName, float amountToBeAdded);
    float getAssetCoins(int userId, String assetName);
    void withdrawFund(int userId, String assetName, float withdrawalAmount);

    Wallet findWallet(int userId, String assetName);

    void addNewWallet(int userId, String assetName, float amountToBeAdded);

    void removeAsset(int userId, String assetName);

    List<FundsInfo> fundsInfo(int userId);
}

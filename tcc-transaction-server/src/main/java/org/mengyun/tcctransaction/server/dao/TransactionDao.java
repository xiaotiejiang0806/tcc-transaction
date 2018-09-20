package org.mengyun.tcctransaction.server.dao;

import org.mengyun.tcctransaction.server.dto.PageDto;
import org.mengyun.tcctransaction.server.vo.TransactionVo;

import java.util.List;

/**
 * Created by changming.xie on 9/7/16.
 */
public interface TransactionDao {

    public PageDto<TransactionVo> findTransactions(Integer pageNum, int pageSize);

    public void resetRetryCount(String globalTxId, String branchQualifier);

    public void delete(String globalTxId, String branchQualifier);

    public void confirm(String globalTxId, String branchQualifier);

    public void cancel(String globalTxId, String branchQualifier);

    public String getDomain();
}


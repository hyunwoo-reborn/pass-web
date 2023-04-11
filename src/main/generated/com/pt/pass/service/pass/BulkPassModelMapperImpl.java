package com.pt.pass.service.pass;

import com.pt.pass.controller.admin.BulkPassRequest;
import com.pt.pass.repository.pass.BulkPassEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-12T00:06:44+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
public class BulkPassModelMapperImpl implements BulkPassModelMapper {

    @Override
    public List<BulkPass> map(List<BulkPassEntity> passEntities) {
        if ( passEntities == null ) {
            return null;
        }

        List<BulkPass> list = new ArrayList<BulkPass>( passEntities.size() );
        for ( BulkPassEntity bulkPassEntity : passEntities ) {
            list.add( bulkPassEntityToBulkPass( bulkPassEntity ) );
        }

        return list;
    }

    @Override
    public BulkPassEntity map(BulkPassRequest bulkPassRequest) {
        if ( bulkPassRequest == null ) {
            return null;
        }

        BulkPassEntity bulkPassEntity = new BulkPassEntity();

        bulkPassEntity.setPackageSeq( bulkPassRequest.getPackageSeq() );
        bulkPassEntity.setUserGroupId( bulkPassRequest.getUserGroupId() );
        bulkPassEntity.setStartedAt( bulkPassRequest.getStartedAt() );

        return bulkPassEntity;
    }

    protected BulkPass bulkPassEntityToBulkPass(BulkPassEntity bulkPassEntity) {
        if ( bulkPassEntity == null ) {
            return null;
        }

        BulkPass bulkPass = new BulkPass();

        bulkPass.setBulkPassSeq( bulkPassEntity.getBulkPassSeq() );
        bulkPass.setUserGroupId( bulkPassEntity.getUserGroupId() );
        bulkPass.setCount( bulkPassEntity.getCount() );
        bulkPass.setStatus( bulkPassEntity.getStatus() );
        bulkPass.setStartedAt( bulkPassEntity.getStartedAt() );
        bulkPass.setEndedAt( bulkPassEntity.getEndedAt() );

        return bulkPass;
    }
}

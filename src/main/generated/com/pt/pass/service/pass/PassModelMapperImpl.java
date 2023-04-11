package com.pt.pass.service.pass;

import com.pt.pass.repository.packaze.PackageEntity;
import com.pt.pass.repository.pass.PassEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-11T23:45:16+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
public class PassModelMapperImpl implements PassModelMapper {

    @Override
    public Pass map(PassEntity passEntity) {
        if ( passEntity == null ) {
            return null;
        }

        Pass pass = new Pass();

        pass.setPackageName( passEntityPackageEntityPackageName( passEntity ) );
        pass.setPassSeq( passEntity.getPassSeq() );
        pass.setPackageSeq( passEntity.getPackageSeq() );
        pass.setUserId( passEntity.getUserId() );
        pass.setStatus( passEntity.getStatus() );
        pass.setRemainingCount( passEntity.getRemainingCount() );
        pass.setStartedAt( passEntity.getStartedAt() );
        pass.setEndedAt( passEntity.getEndedAt() );
        pass.setExpiredAt( passEntity.getExpiredAt() );

        return pass;
    }

    @Override
    public List<Pass> map(List<PassEntity> passEntities) {
        if ( passEntities == null ) {
            return null;
        }

        List<Pass> list = new ArrayList<Pass>( passEntities.size() );
        for ( PassEntity passEntity : passEntities ) {
            list.add( map( passEntity ) );
        }

        return list;
    }

    private String passEntityPackageEntityPackageName(PassEntity passEntity) {
        if ( passEntity == null ) {
            return null;
        }
        PackageEntity packageEntity = passEntity.getPackageEntity();
        if ( packageEntity == null ) {
            return null;
        }
        String packageName = packageEntity.getPackageName();
        if ( packageName == null ) {
            return null;
        }
        return packageName;
    }
}
